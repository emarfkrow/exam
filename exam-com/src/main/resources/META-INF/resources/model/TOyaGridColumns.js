/**
 * 親グリッド定義
 */

let TOyaGridColumns = [
    Column.refer('SOSEN_ID', Messages['TOyaGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_SN', Messages['TOyaGrid.oyaSn'], 150, 'primaryKey numbering', null),
    Column.text('OYA_MEI', Messages['TOyaGrid.oyaMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TOyaGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TOyaGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TOyaGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TOyaGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TOyaGrid.deleteF'], 30, ''),
];
