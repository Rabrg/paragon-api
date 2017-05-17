# paragon-api
A Java wrapper for Epic Games' Paragon API

# Example usage
```java
// Create the API instance
ParagonApi api = new ParagonApi(apiKey);

// Call endpoints
List<Hero> heroes = api.heroes();
for (Hero hero : heroes)
  System.out.println(hero.getName());
```
