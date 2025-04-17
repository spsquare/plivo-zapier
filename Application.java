//Sample code for using these integrations
public class Application{

    public static void main (String[] args){

        List<IService> services = new ArrayList();
        services.add(new GmailService());
        ExecutorService executorService = new ExecutorService();
        executorService.execute("gmail","send-mail",<input-for-mail>);
    }
}