from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        firstGreaterNode = None
        appendNode = None
        current = head
        previous = None
        while current:
            if not firstGreaterNode and current.val >= x:
                firstGreaterNode = current
                appendNode = previous
            
            if not firstGreaterNode:
                previous = current
                current = current.next
                continue

            if current.next and current.next.val < x:
                if not appendNode:
                    head = current
                else:
                    appendNode.next = current
                    previous.next = current.next
                    current.next = firstGreaterNode
                appendNode = current
                current = previous.next
                continue

            previous = current
            current = current.next


        return

head = [1,4,3,2,5,2]
x = 3

sol = Solution()
print(sol.partition(head, x))