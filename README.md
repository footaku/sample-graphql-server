```shell
./gradlew bootRun
```

```shell
curl -X POST -H "Content-Type: application/json" -d '{"query":"{bookById(id:1){id, name, type}}"}' http://localhost:8080/graphql
```

```shell
curl -X POST -H "Content-Type: application/json" -d '{"query":"{bookByName(name:xxx){id, name, type}}"}' http://localhost:8080/graphql
```

<details>
<summary>GraphQL Schema</summary>

```shell
curl "http://localhost:8080/graphql/schema"
```

```graphql
"Marks the field, argument, input field or enum value as deprecated"
directive @deprecated(
    "The reason for the deprecation"
    reason: String = "No longer supported"
  ) on FIELD_DEFINITION | ARGUMENT_DEFINITION | ENUM_VALUE | INPUT_FIELD_DEFINITION

"Directs the executor to include this field or fragment only when the `if` argument is true"
directive @include(
    "Included when true."
    if: Boolean!
  ) on FIELD | FRAGMENT_SPREAD | INLINE_FRAGMENT

"Indicates an Input Object is a OneOf Input Object."
directive @oneOf on INPUT_OBJECT

"Directs the executor to skip this field or fragment when the `if` argument is true."
directive @skip(
    "Skipped when true."
    if: Boolean!
  ) on FIELD | FRAGMENT_SPREAD | INLINE_FRAGMENT

"Exposes a URL that specifies the behaviour of this scalar."
directive @specifiedBy(
    "The URL that specifies the behaviour of this scalar."
    url: String!
  ) on SCALAR

type Book {
  id: ID
  name: String
  type: String
}

type Query {
  bookById(id: ID): Book
  bookByName(name: String): [Book]
}
```
</details>
