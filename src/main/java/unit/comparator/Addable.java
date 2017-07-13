package unit.comparator;

import unit.comparator.exception.AdditionException;

/**
 * Created by sanjeev on 12/07/17.
 */
public interface Addable<T>
{
    public T add(T addendent) throws AdditionException;
}
