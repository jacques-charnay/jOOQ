/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
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
 * For more information, please visit: https://www.jooq.org/legal/licensing
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
package org.jooq.meta;

/**
 * @author Lukas Eder
 */
public class DefaultEmbeddableColumnDefinition
    extends AbstractTypedElementDefinition<EmbeddableDefinition>
    implements EmbeddableColumnDefinition {

    private final ColumnDefinition referencingColumn;
    private final int              position;

    public DefaultEmbeddableColumnDefinition(EmbeddableDefinition container, String definingColumnName, ColumnDefinition referencingColumn, int position) {
        super(container, definingColumnName, position, referencingColumn.getDefinedType(), referencingColumn.getComment());

        this.referencingColumn = referencingColumn;
        this.position = position;
    }

    @Override
    public final int getPosition() {
        return position;
    }

    @Override
    public final ColumnDefinition getReferencingColumn() {
        return referencingColumn;
    }

    @Override
    public final int getReferencingColumnPosition() {
        return getReferencingColumn().getPosition();
    }

    @Override
    public DataTypeDefinition getType() {
        return getReferencingColumn().getType();
    }

    @Override
    public DataTypeDefinition getType(JavaTypeResolver resolver) {
        return getReferencingColumn().getType(resolver);
    }

    @Override
    public DataTypeDefinition getDefinedType() {
        return getReferencingColumn().getDefinedType();
    }

    @Override
    public String toString() {
        return super.toString() + " (referenced by " + getReferencingColumn() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;

        if (!(obj instanceof EmbeddableColumnDefinition))
            return false;

        EmbeddableColumnDefinition other = (EmbeddableColumnDefinition) obj;
        return getReferencingColumn().equals(other.getReferencingColumn());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
