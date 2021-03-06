package dk.theknights.catapult.model.webhook.bitbucket;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"type",
		"name",
		"links",
		"target"
})
public class New {

	@JsonProperty("type")
	private String type;
	@JsonProperty("name")
	private String name;
	@JsonProperty("links")
	private Links links;
	@JsonProperty("target")
	private Target target;

	/**
	 *
	 * @return
	 *     The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 *     The type
	 */
	@JsonProperty("type")
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 *
	 * @return
	 *     The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 *     The name
	 */
	@JsonProperty("name")
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 *     The links
	 */
	@JsonProperty("links")
	public Links getLinks() {
		return links;
	}

	/**
	 *
	 * @param links
	 *     The links
	 */
	@JsonProperty("links")
	public void setLinks(final Links links) {
		this.links = links;
	}

	/**
	 *
	 * @return
	 *     The target
	 */
	@JsonProperty("target")
	public Target getTarget() {
		return target;
	}

	/**
	 *
	 * @param target
	 *     The target
	 */
	@JsonProperty("target")
	public void setTarget(final Target target) {
		this.target = target;
	}

}
