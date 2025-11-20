import java.util.*;
public class QuestionService {
    Question[] questions=new Question[5];
    String selection[] =new String[5];
    public QuestionService()
    {
        questions[0]=new Question(1,"2*2","1","2","4","3","4");
        questions[1]=new Question(2,"3*4","12","3","7","9","12");
        questions[2]=new Question(3,"5*2","5","10","6","7","10");
        questions[3]=new Question(4,"6*3","3","2","18","24","18");
        questions[4]=new Question(5,"4*2","8","4","2","12","8");
    }
    public void playQuiz()
    {
        int i=0;
        for(Question q : questions){
            System.out.println("Question no:"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A."+q.getOpt1());
            System.out.println("B."+q.getOpt2());
            System.out.println("C."+q.getOpt3());
            System.out.println("D."+q.getOpt4());

            Scanner sc=new Scanner(System.in);
            selection[i++]=sc.nextLine();
        }
        for(String s : selection){
            System.out.println(s);
        }
    }
    public void printScore()
    {
        int score=0;
        for(int i=0;i<questions.length;i++)
        {
            Question que=questions[i];
            String actualAnswer=que.getAnswer();


            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : "+score);
    }
}
