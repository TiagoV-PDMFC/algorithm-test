Consider a tree like structure as follows:

![Tree Structure](TreeSchema.png?raw=true "Title")

Each Node has a value property, and a children property:
 - The value property is an integer and is represented inside the node;
 - the children property is an array holding references to the children nodes;
 - Nodes can have any number of children (or none);
 - all property values are final and defined in the constructor

Please define the Node object in code