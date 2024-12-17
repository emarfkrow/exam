/**
 * 子グリッド定義
 */

let Tb1KoGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1KoGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1KoGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1KoGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['Tb1KoGrid.koBn'], 80, 'primaryKey numbering', null),
    Column.text('KO_MEI', Messages['Tb1KoGrid.koMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1KoGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1KoGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1KoGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1KoGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1KoGrid.deleteF'], 30, ''),
];
