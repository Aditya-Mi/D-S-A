class ListNode {
      int key;
      ListNode next;
      public ListNode(int key, ListNode next) {
          this.key = key;
          this.next = next;
      }
  }

  class MyHashSet {
      static final int size = 19997;   // prime
      ListNode[] data;

      public MyHashSet() {
          this.data = new ListNode[size];
      }

      private int hash(int key) {
          return key % size;
      }

      public void add(int key) {
          if (contains(key)) return;               // no duplicates
          int h = hash(key);
          data[h] = new ListNode(key, data[h]);    // insert at head
      }

      public boolean contains(int key) {
          for (ListNode node = data[hash(key)]; node != null; node = node.next)
              if (node.key == key) return true;
          return false;
      }

      public void remove(int key) {
          int h = hash(key);
          ListNode node = data[h];
          if (node == null) return;
          if (node.key == key) {                   // head case
              data[h] = node.next;
              return;
          }
          for (; node.next != null; node = node.next)
              if (node.next.key == key) {
                  node.next = node.next.next;      // unlink
                  return;
              }
      }
  }