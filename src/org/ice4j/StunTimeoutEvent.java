/*
 * ice4j, the OpenSource Java Solution for NAT and Firewall Traversal.
 * Maintained by the SIP Communicator community (http://sip-communicator.org).
 *
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package org.ice4j;

import org.ice4j.message.*;

/**
 * The class is used to dispatch events that occur when a STUN transaction
 * expires.
 *
 * @author Emil Ivov
 */
public class StunTimeoutEvent
    extends BaseStunMessageEvent
{
    /**
     * Serial version UID for this Serializable class.
     */
    private static final long serialVersionUID = 41267841L;

    /**
     * Constructs a <tt>StunTimeoutEvent</tt> according to the specified
     * message.
     *
     * @param message the message itself
     * @param localAddress the local address that the message was sent from.
     */
    public StunTimeoutEvent(Message          message,
                            TransportAddress localAddress)
    {
        super(localAddress, message);
    }

    /**
     * Returns the <tt>TransportAddress</tt> that the message was supposed to
     * leave from.
     *
     * @return the <tt>TransportAddress</tt> that the message was supposed to
     * leave from.
     */
    public TransportAddress getLocalAddress()
    {
        return getSourceAddress();
    }

    /**
     * Returns a <tt>String</tt> representation of this event, containing the
     * corresponding message, and local address.
     *
     * @return a <tt>String</tt> representation of this event, containing the
     * corresponding message, and local address.
     */
    @Override
    public String toString()
    {
        StringBuffer buff = new StringBuffer("StunTimeoutEvent:\n\tMessage=");

        buff.append(getMessage());
        buff.append(" localAddr=").append(getLocalAddress());

        return buff.toString();
    }
}
