import java.time.LocalDate;

public class Post {

    private String quote;
    private LocalDate date;
    private int claps;
    private int boos;
    private UserAccount account;

    public void Post(String quote, UserAccount account) {
        this.quote = quote;
        this.account = account;
        this.date = LocalDate.now();

    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


    public int getClaps() {
        return claps;
    }


    public int getBoos() {
        return boos;
    }



    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public String show(){
        return "["+ date +"] "+account.getUserName()+"\n" + "says \""+quote+"\" | Claps: "+claps+" | Boos: "+boos+".";
    }

    public void clap(){
        claps++;
    }

    public void boo(){
        boos++;
    }




}
