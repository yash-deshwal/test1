package op.ac.com.cs.task1.resources;


import op.ac.com.cs.task1.models.Question;

import op.ac.com.cs.task1.models.QuizUser;
import op.ac.com.cs.task1.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping("/questions")
    public List<Question> getQuestion(){
        return questionService.getAllQuestion();
    }
    @GetMapping("/questions/{id}")
    public Question getQuestion(@PathVariable String id){
        return questionService.getQuestion(id);
    }
   // @RequestMapping(method = RequestMethod.POST, value="/questions")
   @PostMapping("/questions")
    public void addQuestion(@RequestBody Question questions){
        questionService.addQuestion(questions);

    }
    @PutMapping("/questions")
    public void updateQuestion(@RequestBody Question question){
        questionService.updateQuestion(question);
    }
    @DeleteMapping("/questions/{id}")
    public void deleteQuestion(@PathVariable String id){
        questionService.deleteQuestion(id);
    }


}
