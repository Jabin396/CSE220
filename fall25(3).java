
static Stack mergeStacks(Stack stack1, Stack stack2) {

    Stack temp = new Stack();
    Stack result = new Stack();

    while (!stack1.isEmpty() && !stack2.isEmpty()) {

        if (stack1.peek() < stack2.peek()) {
            temp.push(stack1.pop());
        }
        else {
            temp.push(stack2.pop());
        }
    }

    while (!stack1.isEmpty()) {
        temp.push(stack1.pop());
    }

    while (!stack2.isEmpty()) {
        temp.push(stack2.pop());
    }

    while (!temp.isEmpty()) {
        result.push(temp.pop());
    }

    return result;
}
