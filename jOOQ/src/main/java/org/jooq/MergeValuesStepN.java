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

import static org.jooq.SQLDialect.CUBRID;
// ...
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.MYSQL;
// ...
// ...
// ...
// ...

import java.util.Collection;

/**
 * This type is used for the H2-specific variant of the {@link Merge}'s DSL API.
 * <p>
 * Example: <code><pre>
 * DSLContext create = DSL.using(configuration);
 *
 * create.mergeInto(table, field1, field2)
 *       .key(id)
 *       .values(value1, value2)
 *       .execute();
 * </pre></code>
 *
 * @author Lukas Eder
 */
public interface MergeValuesStepN<R extends Record> {

    /**
     * Specify a <code>VALUES</code> clause
     */
    @Support({ CUBRID, DERBY, FIREBIRD, H2, HSQLDB, MYSQL })
    Merge<R> values(Object... values);

    /**
     * Specify a <code>VALUES</code> clause
     */
    @Support({ CUBRID, DERBY, FIREBIRD, H2, HSQLDB, MYSQL })
    Merge<R> values(Field<?>... values);

    /**
     * Specify a <code>VALUES</code> clause
     */
    @Support({ CUBRID, DERBY, FIREBIRD, H2, HSQLDB, MYSQL })
    Merge<R> values(Collection<?> values);

    /**
     * Use a <code>SELECT</code> statement as the source of values for the
     * <code>MERGE</code> statement
     * <p>
     * This variant of the <code>MERGE .. SELECT</code> statement expects a
     * select returning exactly as many fields as specified previously in the
     * <code>INTO</code> clause:
     * {@link DSLContext#mergeInto(Table, Field...)} or
     * {@link DSLContext#mergeInto(Table, Collection)}
     */
    @Support({ CUBRID, FIREBIRD, H2, HSQLDB })
    Merge<R> select(Select<?> select);
}
