package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     * @param paramMap
     * @param modle
     * @return
     */

    String process(Map<String, String> paramMap, Map<String, Object> modle);

}
