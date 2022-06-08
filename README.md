# flutter_sksl_no_data_repro

An example of `No data was received` issue with `--cache-sksl` and `provideFlutterEngine`.

## Run

```sh
flutter run --profile --cache-sksl
```

Then, press M.

Expected behavior:
`flutter` command prints
```
Wrote SkSL data to /Users/me/Projects/flutter_sksl_no_data_repro/flutter_01.sksl.json.
```

Actual behavior:
`flutter` command prints
```
No data was received. To ensure SkSL data can be generated use a physical device then:
  1. Pass "--cache-sksl" as an argument to flutter run.
  2. Interact with the application to force shaders to be compiled.
```
