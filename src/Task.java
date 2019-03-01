import java.util.Date;

public class Task {

    String perform;
    Date dateEnd;
    Date dateStat;
    Boolean done;

    public Task(String perform, Date dateStat) {
        this.perform = perform;
        this.dateStat = dateStat;
        this.done = false;
    }

    public String getPerform() {
        return perform;
    }

    public void setPerform(String perform) {
        this.perform = perform;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Date getDateStat() {
        return dateStat;
    }

    public void setDateStat(Date dateStat) {
        this.dateStat = dateStat;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
