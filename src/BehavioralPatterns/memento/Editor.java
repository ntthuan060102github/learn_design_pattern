package BehavioralPatterns.memento;

public class Editor {
    protected String content;

    public void type(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return this.content;
    }

    public EditorMemento save()
    {
        return new EditorMemento(this.content);
    }

    public void undo(EditorMemento editorMemento)
    {
        this.content = editorMemento.getContent();
    }
}
