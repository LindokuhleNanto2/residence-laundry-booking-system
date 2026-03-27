/*
 *
 * Author:Lindokuhle Nanto
 * Student Nr:240443608
 * Date:24 March 2026
 * */

package za.ac.cput.repository;

import java.util.Set;

public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
    Set<T> getAll();
}
