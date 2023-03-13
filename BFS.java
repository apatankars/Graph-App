package sol;

import src.IBFS;
import src.IEdge;
import src.IGraph;
import src.IVertex;

import java.util.List;

public class BFS<V extends IVertex<E>, E extends IEdge<V>> implements IBFS<V, E> {

    // TODO: implement the getPath method!
    @Override
    public List<E> getPath(IGraph<V, E> graph, V start, V end) {
        return null;
    }

    // TODO: feel free to add your own methods here!
    // hint: maybe you need to get a City by its name
}
