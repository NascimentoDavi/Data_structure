package Collections.Sets;

import java.util.HashSet;

public class CustomHashSet<E> extends HashSet<E> {

    @Override
    public String toString(){
        // Custom implementation

        StringBuilder sb = new StringBuilder();

        sb.append("CustomHashSet: [");

        for(E element : this) {
            sb.append(element.toString()).append(", ");
        }

        if(this.size() > 0){
            sb.setLength(sb.length() - 2); // remove the trailing comma and space
        }

        sb.append("]");

        return sb.toString();
    }

}