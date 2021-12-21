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
package com.xwiki.ideas.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.xwiki.rest.XWikiRestException;
import org.xwiki.stability.Unstable;

import com.xwiki.ideas.model.jaxb.Idea;

/**
 * @version $Id$
 * @since 1.14
 */
@Path("/wikis/{wikiName}/spaces/{spaceName: .+}/pages/{pageName}/idea/{voterGroup}")
@Unstable
public interface IdeasVoteResource
{
    /**
     * Casts the vote of the current user to the page containing an idea.
     *
     * @param xwikiName The name of the wiki in which the page resides
     * @param spaceName The spaces associated with the page
     * @param pageName The name of the page
     * @param voterGroup The group the user belongs to with regards to the Idea
     * @return A response containing a serialized version of a {@link com.xwiki.ideas.model.jaxb.Idea} in case of
     *     success or an appropriate response code otherwise.
     * @throws XWikiRestException when the document is missing or lacks an Ideas poll
     */
    @POST
    Idea vote(
        @PathParam("wikiName") String xwikiName,
        @PathParam("spaceName") String spaceName,
        @PathParam("pageName") String pageName,
        @PathParam("voterGroup") String voterGroup
    ) throws XWikiRestException;

    /**
     * Removes the vote of the current user from the page containing the desired idea.
     *
     * @param xwikiName The name of the wiki in which the page resides
     * @param spaceName The spaces associated with the page
     * @param pageName The name of the page
     * @param voterGroup The group the user belongs to with regards to the Idea
     * @return A response containing a serialized version of a {@link com.xwiki.ideas.model.jaxb.Idea} in case of
     *     success or an appropriate response code otherwise.
     * @throws XWikiRestException when the document is missing or lacks an Ideas poll
     */
    @DELETE
    Idea undoVote(
        @PathParam("wikiName") String xwikiName,
        @PathParam("spaceName") String spaceName,
        @PathParam("pageName") String pageName,
        @PathParam("voterGroup") String voterGroup
    ) throws XWikiRestException;
}
