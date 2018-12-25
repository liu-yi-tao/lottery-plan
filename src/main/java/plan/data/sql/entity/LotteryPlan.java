package plan.data.sql.entity;

import java.util.Date;

public class LotteryPlan {
    private Integer id;

    private String name;

    private String betType;

    private String betCount;

    private String period;

    private Integer position;

    private String schema;

    private Date time;

    private String result;

    private String winPeriod;

    private String win;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBetType() {
        return betType;
    }

    public void setBetType(String betType) {
        this.betType = betType == null ? null : betType.trim();
    }

    public String getBetCount() {
        return betCount;
    }

    public void setBetCount(String betCount) {
        this.betCount = betCount == null ? null : betCount.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getWinPeriod() {
        return winPeriod;
    }

    public void setWinPeriod(String winPeriod) {
        this.winPeriod = winPeriod == null ? null : winPeriod.trim();
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win == null ? null : win.trim();
    }
}