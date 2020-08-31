package scripts

import com.wdk.tms.domain.rule.BasicCleanRule
import com.wdk.tms.domain.rule.model.BmsOutputEventDTO
import com.wdk.tms.domain.spring.AutowiredTestService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired

@CompileStatic
class HelloBeanRule implements BasicCleanRule {
    @Override
    List<BmsOutputEventDTO> execute(Map<String, Object> source) {
        println "Hello, I'm config in web"
        return null
    }
}
