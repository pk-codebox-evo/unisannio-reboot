package solutions.alterego.android.unisannio.cercapersone;

import java.util.List;

import solutions.alterego.android.unisannio.interfaces.IParser;
import solutions.alterego.android.unisannio.interfaces.IRetriever;

public interface ICercapersonePresenter {

    public void setParser(@NIParser parser);

    public void setRetriever(IRetriever retriever);

    public List<Person> getPeople();
}