package de.thro.inf.prg3.a02;

import javax.lang.model.element.Element;
import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList {

    Element head = new Element(1, null);

    public void add(Object item) {
        Element neu = new Element(item, null);
        Element monkey = new Element(1, null);
        while (monkey.next != null) {
            monkey = monkey.next;
        }
        monkey.next = neu;
    }

    public int size() {
        int counter = 0;
        Element monkey = new Element(1, null);
        while (monkey.next != null) {
            counter++;
        }
        return counter;
    }

    public SimpleList filter(SimpleFilter filter) {
        return this;
    }

    static class Element {
        Object item;
        Element next;

        public Element(Object obj, Element elem) {
            this.item = obj;
            this.next = elem;
        }
    }

    public class SimpleIteratorImpl implements Iterator {

        Element current;

        public boolean hasNext() {
            return current != null;
        }

        public Element next() {
            return current.next;
        }
    }
}
