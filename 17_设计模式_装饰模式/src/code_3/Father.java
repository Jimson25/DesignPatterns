package code_3;

import code_3.decorator.HighScoreDecorator;
import code_3.decorator.SortDecorator;
import code_3.report.FourthGradeSchoolReport;
import code_3.report.SchoolReport;

public class Father {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr;
        /*
            //原装的成绩单
            sr = new FourthGradeSchoolReport();
            //加了最高分说明的成绩单
            sr = new HighScoreDecorator(sr);
            //又加了成绩排名的说明
            sr = new SortDecorator(sr);
        */
        sr = new SortDecorator(new HighScoreDecorator(new FourthGradeSchoolReport()));
        //看成绩单
        sr.report();
        //然后老爸一看，很开心，就签名了
        sr.sign("张三");


    }
}
