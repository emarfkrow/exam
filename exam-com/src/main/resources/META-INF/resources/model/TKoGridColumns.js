/**
 * 子グリッド定義
 */

let TKoGridColumns = [
    Column.refer('SOSEN_ID', Messages['TKoGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_SN', Messages['TKoGrid.oyaSn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_SN', Messages['TKoGrid.entitySn'], 150, 'primaryKey numbering', null),
    Column.comma('KO_SN', Messages['TKoGrid.koSn'], 150, 'primaryKey numbering', null),
    Column.text('KO_MEI', Messages['TKoGrid.koMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TKoGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TKoGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TKoGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TKoGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TKoGrid.deleteF'], 30, ''),
];
