package de.thro.inf.prg3.a02;

import javax.lang.model.element.Element;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList {

    Element head = new Element();

    public void add(Object item) {

    }

    public int size() {
        return 1;
    }

    public SimpleList filter(SimpleFilter filter) {
        return this;
    }

    public boolean hasNext() {
        return true;
    }

    public Object next() {
        return 1;
    }

    static class Element {
        Object item;
        Element next;

        public Element(Object obj, Element elem) {
            this.item = obj;
        }
    }

    interface Iterator {
        public boolean hasNext();

        public Object next();
    }
}
