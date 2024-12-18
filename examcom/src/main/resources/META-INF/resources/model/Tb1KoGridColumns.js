/**
 * 子グリッド定義
 */

let Tb1KoGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1KoGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1KoGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1KoGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['Tb1KoGrid.koBn'], 80, 'primaryKey numbering', null),
    Column.text('KO_MEI', Messages['Tb1KoGrid.koMei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Tb1KoGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1KoGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1KoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1KoGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1KoGrid.deleteF'], 30, ''),
];
