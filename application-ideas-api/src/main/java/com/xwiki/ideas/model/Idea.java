/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.xwiki.ideas.model;

import java.util.ArrayList;
import java.util.List;

import org.xwiki.stability.Unstable;

/**
 * Represents a serializable version of a vote result.
 *
 * @version $Id$
 * @since 1.14
 */
@Unstable
public class Idea
{
    protected final List<String> supporters = new ArrayList<>();

    protected final List<String> opponents = new ArrayList<>();

    /**
     * @return the reference to the list of supporters
     */
    public List<String> getSupporters()
    {
        return this.supporters;
    }

    /**
     * @return the reference to the list of opponents
     */
    public List<String> getOpponents()
    {
        return this.opponents;
    }
}
