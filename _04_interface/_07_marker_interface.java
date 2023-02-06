package _04_interface;

public class _07_marker_interface{
/*
 * 1. if an interface does not contain any methods and by implementing that 
 * 		interface our objects will get some ability such type of interfaces
 * 		are called marker interface or ability interface or tagged interface.
 * 		eg:-                            | 
 * 			 Serializable(I)------------|
 * 			 Cloneable(I)---------------|---> these are marked for some ability
 * 			 RandomAccess(I)------------|
 * 			 SingleThreadModel(I)-------|
 * 
 * ---by implementing Serializable interface our object can be saved to file and can travel
 * 		across network.
 * ---by implementing cloneable interface our objects are in a position to produce exactly 
 * 		duplicate objects.
 * 
 *<Question> without having any methods how the objects will get some ability in marker
 *				interfaces?
 *<Answer> internally jvm is responsible to provide the required ability.
 *
 *<Question> why jvm is providing required ability in marker interfaces?
 *<Answer> to reduce complexity of programming, and to make java language simple.
 *
 *<Question> is it possible to create our own marker interface?
 *<Answer> yes, but customization of jvm is required
 */
}
