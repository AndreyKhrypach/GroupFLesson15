package app.service;

import app.enumHelper.Topic;

public class BookService {

    public void bookMenu() {
        Topic[] topics = Topic.values();
        for (Topic topic :
                topics) {
            System.out.printf("%d. Book ganre %s \n",
                    topic.ordinal() + 1, topic);
        }
    }

}
