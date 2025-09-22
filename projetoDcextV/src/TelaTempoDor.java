import javax.swing.*;
import java.awt.*;

public class TelaTempoDor extends TelaBase {

    public TelaTempoDor(String convenio, String regiaoDor) {
        super("Tempo da Dor");

        JPanel panel = criarPainelGradiente();
        setContentPane(panel);
        panel.setLayout(new BorderLayout(0, 40));
        panel.setBorder(BorderFactory.createEmptyBorder(150, 50, 0, 50));

        JPanel textPanel = new JPanel();
        textPanel.setOpaque(false);
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("Há quanto tempo você sente essa dor?");
        titulo.setFont(new Font("Montserrat", Font.BOLD, 55));
        titulo.setForeground(Color.WHITE);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descricao = new JLabel("Escolha a opção que melhor representa há quanto tempo sente desconforto.");
        descricao.setFont(new Font("Montserrat", Font.PLAIN, 22));
        descricao.setForeground(new Color(220, 220, 240));
        descricao.setAlignmentX(Component.CENTER_ALIGNMENT);

        textPanel.add(titulo);
        textPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        textPanel.add(descricao);
        panel.add(textPanel, BorderLayout.NORTH);

        JPanel botoesPanel = new JPanel(new GridLayout(2, 2, 40, 40));
        botoesPanel.setOpaque(false);
        botoesPanel.setBorder(BorderFactory.createEmptyBorder(40, 200, 40, 200));

        String[] tempos = {"Menos de 24h", "De 1 a 3 dias", "Mais de 3 dias", "Mais de 1 semana"};
        for (String tempo : tempos) {
            RoundedButton btn = new RoundedButton(tempo, new Color(55, 48, 163, 150), new Color(94, 23, 235, 100), new Color(150, 100, 250, 150));
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.addActionListener(e -> {
                new TelaResumo(convenio, regiaoDor, tempo).setVisible(true);
                dispose();
            });
            botoesPanel.add(btn);
        }
        panel.add(botoesPanel, BorderLayout.CENTER);

        adicionarNavegacao(panel, true, new TelaDor(convenio));
    }
}