import java.util.Scanner;

public class QuestionService {

    Question[] question = new Question[5];
    // we got the  questions, which are just the reference not the object
    String[] selection = new String[5];

    public QuestionService() {
        //To initialize the object from the reference
        question[0] = new Question(1, "Size of int", "2", "4", "6", "8", "4");
        question[1] = new Question(2, "Size of double", "2", "4", "6", "8", "8");
        question[2] = new Question(3, "Size of long", "2", "4", "6", "8", "8");
        question[3] = new Question(4, "Size of char", "2", "4", "6", "8", "2");
        question[4] = new Question(5, "Size of boolean", "1", "4", "6", "8", "1");
    }

    public void playQuiz() {

        int i = 0;
        for (Question q : question) {
//            System.out.println(q);//When you try to print any object it will automatically call the built-in toString() method
            System.out.println("Question No :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String sel : selection) {
            System.out.println(sel);
        }
    }

    public void printScore() {

        int score = 0;
        for (int i = 0; i < question.length; i++) {
            Question q = question[i];

            String ans = q.getAnswer();
            String userAnswer = selection[i];

            if (ans.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("Score :" + score);
    }
}
