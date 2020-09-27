package mylist;

/**
 * @创建人：关涛
 * @创建时间: 2020/9/27
 * @描述：
 */
public interface IMyList<E> {

    /**
     * 集合中元素的个数
     *
     * @return
     */
    int size();

    /**
     * 如何集合里面没有元素则返回true
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 如果集合里面的含有指定的元素则返回true
     *
     * @param o
     * @return
     */
    boolean contain(Object o);

    /**
     * 按照顺序遍历集合中的元素
     *
     * @return
     */
    Iterable<E> iterator();
}
