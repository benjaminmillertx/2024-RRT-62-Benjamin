import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApp extends JFrame {
    private JLabel questionLabel;
    private JTextField answerField;
    private Timer timer;
    private String[] questions;
    private String[] answers;
    private int currentQuestionIndex;

    public QuizApp() {
        setTitle("Quiz App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Sample questions and answers
        questions = new String[]{"Question 1?", "Question 2?", "Question 3?"};
        answers = new String[]{"Answer 1", "Answer 2", "Answer 3"};

        questionLabel = new JLabel();
        answerField = new JTextField(20);
        JButton submitButton = new JButton("Submit");
        JPanel panel = new JPanel();
        panel.add(questionLabel);
        panel.add(answerField);
        panel.add(submitButton);
        add(panel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        timer = new Timer(20000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextQuestion();
            }
        });
    }

    public void startQuiz() {
        currentQuestionIndex = 0;
        showQuestion();
        timer.start();
    }

    private void showQuestion() {
        if (currentQuestionIndex < questions.length) {
            questionLabel.setText(questions[currentQuestionIndex]);
        } else {
            JOptionPane.showMessageDialog(this, "End of Quiz");
            timer.stop();
        }
    }

    private void checkAnswer() {
        if (currentQuestionIndex < questions.length) {
            String userAnswer = answerField.getText();
            String correctAnswer = answers[currentQuestionIndex];
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect!");
            }
            answerField.setText("");
            nextQuestion();
        }
    }

    private void nextQuestion() {
        currentQuestionIndex++;
        showQuestion();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuizApp app = new QuizApp();
                app.startQuiz();
                app.setVisible(true);
            }
        });
    }
}
