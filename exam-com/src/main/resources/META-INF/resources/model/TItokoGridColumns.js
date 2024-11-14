/**
 * 従妹グリッド定義
 */

let TItokoGridColumns = [
    Column.comma('ITOKO_ID', Messages['TItokoGrid.itokoId'], 150, 'primaryKey numbering', null),
    Column.text('ITOKO_MEI', Messages['TItokoGrid.itokoMei'], 300, '', null),
    Column.refer('SOSEN_ID', Messages['TItokoGrid.sosenId'], 150, '', 'null'),
    Column.comma('OYA_BN', Messages['TItokoGrid.oyaBn'], 150, '', null),
    Column.comma('ENTITY_BN', Messages['TItokoGrid.entityBn'], 150, '', null),
    Column.cell('INSERT_DT', Messages['TItokoGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TItokoGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TItokoGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TItokoGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TItokoGrid.deleteF'], 30, ''),
];
