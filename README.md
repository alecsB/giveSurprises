# giveSurprises

**********  Because it is never bad to give,
            This application gives random surprises and proverbs *********
            
 > This application represents a generic system that can:
              > use different types of surprises(i.e. that implement a common interface);
              > implement various algorithms for storing and giving surprises;
              > use a powerful, random mechanism to generate a (new) set of surprises;
              > manage surprises in a generic way, regardless of the (current) type of container
              > gives random proverbs from a list of strings
           
 > The storage of surprises:
              > all surprises are stored in various types of containers that will dictate the storage mode and especially the order in which the surprises are divided/given.
              > there are 3 types of bags for surprises
                        > FIFO bag: gives surprises in the order in which they were introduced(first in first out principle);
                        > LIFO bag: gives surprises in the reverse order of introduction(last in first out principle);
                        > RANDOM bag: gives random surprises

> Creation of surprises (GathereSurprises class):
              > the class does not allow the creation of instances or inheritance because its implementation is final and all methods are static
  
> Containers creation(IBagFactory):
              > uses a unique mechanism to generate a new container;
              > allows the definition of several "factories" of bag types, which can be optimized for various constraints (i.e. access speed, storage space, etc.)
           
> Give surprises(AbstractGiveSurprises):
              > this abstract class is extended by 3 types of normal classes as follows: 
                                                           > GiveSurprisesAndApplause
                                                           > GiveSurprisesAndHug
                                                           > GiveSurprisesAndSing
