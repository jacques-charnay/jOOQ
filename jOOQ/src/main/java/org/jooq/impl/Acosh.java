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
package org.jooq.impl;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.impl.Tools.DataExtendedKey.*;
import static org.jooq.impl.Tools.DataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.Function1;
import org.jooq.Record;
import org.jooq.conf.*;
import org.jooq.impl.*;
import org.jooq.impl.QOM.*;
import org.jooq.tools.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.BigDecimal;


/**
 * The <code>ACOSH</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unused" })
final class Acosh
extends
    AbstractField<BigDecimal>
implements
    QOM.Acosh
{

    final Field<? extends Number> number;

    Acosh(
        Field<? extends Number> number
    ) {
        super(
            N_ACOSH,
            allNotNull(NUMERIC, number)
        );

        this.number = nullSafeNotNull(number, INTEGER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {




















            case CUBRID:
            case DERBY:
            case H2:
            case HSQLDB:
            case IGNITE:
            case MARIADB:
            case MYSQL:
            case YUGABYTEDB:
                ctx.visit(DSL.ln(iadd(number, DSL.sqrt(isub(square(number), one())))));
                break;

            default:
                ctx.visit(function(N_ACOSH, getDataType(), number));
                break;
        }
    }












    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<? extends Number> $number() {
        return number;
    }

    @Override
    public final QOM.Acosh $number(Field<? extends Number> newValue) {
        return $constructor().apply(newValue);
    }

    public final Function1<? super Field<? extends Number>, ? extends QOM.Acosh> $constructor() {
        return (a1) -> new Acosh(a1);
    }






















    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Acosh) { QOM.Acosh o = (QOM.Acosh) that;
            return
                StringUtils.equals($number(), o.$number())
            ;
        }
        else
            return super.equals(that);
    }
}