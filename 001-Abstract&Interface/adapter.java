public interface Connector {
    public abstract void execute();
}

class FacebookConnector implements Connector {
    String facebookLink;

    FacebookConnector(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    @Override
    public void execute()
    {
        System.out.println("Executing " + this.facebookLink);
    }

}

class RedditConnector implements Connector {
    String redditlink;

    RedditConnector(String redditlink) {
        this.redditlink = redditlink;
    }

    @Override
    public void execute()
    {
        System.out.println("Doing reddit");
        System.out.println("Executing " + this.redditlink);
    }

}


class AdapterExecutor
{
    private Connector connect;
    AdapterExecutor(Connector connector) {
           this.connect = connector;
    }

    public void execute() {
        System.out.println("Executing Connector");
        this.connect.execute();
    }
}

public class Main {
    public static void main(String[] args) {

        RedditConnector reddit = new RedditConnector("r/usa");
        FacebookConnector facebook  = new FacebookConnector("/usa");
        AdapterExecutor adapter = new AdapterExecutor(reddit);
        AdapterExecutor adapter2 = new AdapterExecutor(reddit);

        adapter.execute();

    }
}