/*
 * Copyright James Dempsey, 2011
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package pcgen.core;

import java.util.Objects;

/**
 * The Class {@code ChronicleEntry} contains a record of an
 * event in the character's history.
 */
public class ChronicleEntry implements Cloneable
{
	private boolean outputEntry = true;
	private String campaign = "";
	private String adventure = "";
	private String party = "";
	private String date = "";
	private int xpField = 0;
	private String gmField = "";
	private String chronicle = "";

	/**
	 * @return the outputEntry
	 */
	public boolean isOutputEntry()
	{
		return outputEntry;
	}

	/**
	 * @param outputEntry the outputEntry to set
	 */
	public void setOutputEntry(boolean outputEntry)
	{
		this.outputEntry = outputEntry;
	}

	/**
	 * @return the campaign
	 */
	public String getCampaign()
	{
		return campaign;
	}

	/**
	 * @param campaign the campaign to set
	 */
	public void setCampaign(String campaign)
	{
		this.campaign = campaign;
	}

	/**
	 * @return the adventure
	 */
	public String getAdventure()
	{
		return adventure;
	}

	/**
	 * @param adventure the adventure to set
	 */
	public void setAdventure(String adventure)
	{
		this.adventure = adventure;
	}

	/**
	 * @return the party
	 */
	public String getParty()
	{
		return party;
	}

	/**
	 * @param party the party to set
	 */
	public void setParty(String party)
	{
		this.party = party;
	}

	/**
	 * @return the date
	 */
	public String getDate()
	{
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date)
	{
		this.date = date;
	}

	/**
	 * @return the xpField
	 */
	public int getXpField()
	{
		return xpField;
	}

	/**
	 * @param xpField the xpField to set
	 */
	public void setXpField(int xpField)
	{
		this.xpField = xpField;
	}

	/**
	 * @return the gmField
	 */
	public String getGmField()
	{
		return gmField;
	}

	/**
	 * @param gmField the gmField to set
	 */
	public void setGmField(String gmField)
	{
		this.gmField = gmField;
	}

	/**
	 * @return the chronicle
	 */
	public String getChronicle()
	{
		return chronicle;
	}

	/**
	 * @param chronicle the chronicle to set
	 */
	public void setChronicle(String chronicle)
	{
		this.chronicle = chronicle;
	}

	@Override
	public ChronicleEntry clone() throws CloneNotSupportedException
	{
		return (ChronicleEntry) super.clone();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adventure == null) ? 0 : adventure.hashCode());
		result = prime * result + ((campaign == null) ? 0 : campaign.hashCode());
		result = prime * result + ((chronicle == null) ? 0 : chronicle.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((gmField == null) ? 0 : gmField.hashCode());
		result = prime * result + (outputEntry ? 1231 : 1237);
		result = prime * result + ((party == null) ? 0 : party.hashCode());
		result = prime * result + xpField;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		//Check for memory address
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		ChronicleEntry other = (ChronicleEntry) obj;
		return Objects.equals(this, other);
	}
}
