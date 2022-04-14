/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A generator context is an argument object that is passed to a
 * {@link Generator} when generating client side computed columns.
 * <p>
 * This API is part of a commercial only feature. To use this feature, please
 * use the jOOQ Professional Edition or the jOOQ Enterprise Edition.
 *
 * @author Lukas Eder
 */
public interface GeneratorContext<T> extends Scope {

    /**
     * The target field whose contents are being generated, or <code>null</code>
     * when the field is unknown / not applicable.
     */
    @Nullable
    Field<T> field();

    /**
     * The statement type in which the {@link Generator} is being invoked, or
     * <code>null</code> when the statement type is unknown / not applicable.
     */
    @Nullable
    GeneratorStatementType statementType();
}