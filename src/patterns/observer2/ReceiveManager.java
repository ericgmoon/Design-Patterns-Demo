package patterns.observer2;

import java.util.HashSet;
import java.util.Set;

public class ReceiveManager {

  Set<ReceiveListener> listeners = new HashSet<ReceiveListener>();

  public void subscribe(ReceiveListener listener) {
    listeners.add(listener);
  }

  public void unsubscribe(ReceiveListener listener) {
    listeners.remove(listener);
  }

  public void notifyListeners(CommunicationType type, String sender) {
    for (ReceiveListener l : listeners) {
      switch (type) {
        case CALL:
          if (l instanceof CallReceiveListener)
            l.update(sender);
          break;
        case MESSAGE:
          if (l instanceof MessageReceiveListener)
            l.update(sender);
          break;
      }
    }
  }
}