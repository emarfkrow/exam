/**
 * 主キーなしグリッド定義
 */

let TNoPkGridColumns = [
    Column.text('COLUMN_A', Messages['TNoPkGrid.columnA'], 300, '', null),
    Column.text('COLUMN_B', Messages['TNoPkGrid.columnB'], 300, '', null),
    Column.text('COLUMN_C', Messages['TNoPkGrid.columnC'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TNoPkGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TNoPkGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TNoPkGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TNoPkGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TNoPkGrid.deleteF'], 10, ''),
];
