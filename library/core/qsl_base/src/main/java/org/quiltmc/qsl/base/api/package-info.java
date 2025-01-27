/**
 * <h2>The Quilt Base APIs.</h2>
 * <p>
 * The Quilt Base API contains most of the founding stones for the Quilt Standard Libraries.
 * This module does not depend on other modules.
 *
 * <p>
 * <h3>{@link org.quiltmc.qsl.base.api.event Event APIs}</h3>
 * This module offers an event framework used in most of the Quilt Standard Libraries.
 * An event is created through the {@link org.quiltmc.qsl.base.api.event.Event} class.
 *
 * <p>
 * <h3>{@link org.quiltmc.qsl.base.api.entrypoint Entrypoints}</h3>
 * This module provides the most basic entrypoints:
 * <ul>
 *     <li>{@link org.quiltmc.qsl.base.api.entrypoint.ModInitializer the common initializer}</li>
 *     <li>{@link org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer the client initializer}</li>
 *     <li>{@link org.quiltmc.qsl.base.api.entrypoint.server.DedicatedServerModInitializer the dedicated server initializer}</li>
 * </ul>
 * More information can be found in {@link org.quiltmc.qsl.base.api.entrypoint the package itself}.
 *
 * <p>
 * <h3>{@link org.quiltmc.qsl.base.api.phase Phase Sorting APIs}</h3>
 * This module offers a phase sorter, which is a very simple non-cyclic graph solver.
 * This is used for ordering event phases and may be used for other stuff.
 * To sort phases {@linkplain org.quiltmc.qsl.base.api.phase.PhaseSorting#sortPhases(java.util.List) a sort method is provided}.
 *
 * <p>
 * <h3>Other Utilities</h3>
 * This module provides some common utilities found in {@link org.quiltmc.qsl.base.api.util the util package}.
 */

package org.quiltmc.qsl.base.api;
