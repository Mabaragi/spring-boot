package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller 어노테이션이 지정된 클래스를 컨트롤러로 인식하고 해당 클래스의 인스턴스를 생성하여 요청과 응답을 처리합니다.
@Controller
public class HelloController {

    @GetMapping("hello")  // hello url로 매핑하라
    public String hello(Model model){
        model.addAttribute("data", "Hello!!");  // 컨텍스트 형식으로 데이터를 넘김. html 파일에서 포멧팅{data:hello}
        return "hello";  // templates 의 hello.html 으로 렌더링 하라.
    }

    @GetMapping("hell-mvc")
    public  String helloMvc(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
    @GetMapping("hello-string")
    @ResponseBody  // html, view와 연동하지않고 return 데이터 자체를 반환함.
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody  // 문자가 아니라 객체라면 {속성: value} 형태의 Json 으로 반환한다.
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;  // 객체로 반환하면 json 형태로 반환된다.

    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
