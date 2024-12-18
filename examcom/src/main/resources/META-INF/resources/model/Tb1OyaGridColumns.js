/**
 * 親グリッド定義
 */

let Tb1OyaGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1OyaGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1OyaGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.text('OYA_MEI', Messages['Tb1OyaGrid.oyaMei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Tb1OyaGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1OyaGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1OyaGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1OyaGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1OyaGrid.deleteF'], 30, ''),
];
