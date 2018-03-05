package interceptores;

    import com.opensymphony.xwork2.Action;
    import com.opensymphony.xwork2.ActionInvocation;
    import com.opensymphony.xwork2.interceptor.Interceptor;
    import java.util.Map;

    public class InterceptorLogin implements Interceptor {
        @Override
        public void destroy() { }
        @Override
        public void init() { }
        @Override
        public String intercept(ActionInvocation actionInvocation) throws Exception {
            Map session = actionInvocation.getInvocationContext().getSession();
            if (session.get("id_usuario") == null || session.get("id_usuario") == "") { 
                return Action.ERROR;
            } else {
              return actionInvocation.invoke();
            }
        }
    }
