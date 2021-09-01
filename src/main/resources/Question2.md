Consider a tree like structure as follows:

![Tree Structure](TreeSchema.png?raw=true "Title")

Each Node has a value property, and a children property:
- The value property is an integer and is represented inside the node;
- the children property is an array holding references to the children nodes;
- Nodes can have any number of children (or none);
- all property values are final and defined in the constructor
 - This means that for the example structure:
   - Node 1 would be represented by: {value: 1, children: [Node2, Node3]};
   - Node 2 would be represented by: {value: 2, children: [Node4, Node5, Node6]};
   - and so on;
 - Nodes can have any number of children (or none);
 - Depending on how far down the tree a Node is, he also has a depth value, but that is dependent ont he starting node.
   - In the example if we start with Node 1, then Node 2's depth is one, but if we start with node 2, then Node 2's depth is zero and Node 4's depth is one;
   
Please define the Node object and write an algorithm to, given a node, return the sum of the value of all nodes down the node tree where:
 - the Value for nodes in even depths is worth twice as much (excluding zero depth);

For instance, for the provided tree the output would be:

    depth 0: 1;
    depth 1: 2 + 3;
    depth 2: 2 x (1 + 2 + 5 + 4 + 5);
    
    total: 40