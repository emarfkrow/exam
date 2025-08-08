/**
 * 単位４グリッド定義
 */

let Tb8Unit4GridColumns = [];

$(function() {
    Tb8Unit4GridColumns = [
        Column.text('UNIT4_ID', Messages['Tb8Unit4Grid.unit4Id'], 90, 'primaryKey numbering', null),
        Column.text('SUM3_ID', Messages['Tb8Unit4Grid.sum3Id'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb8Unit4Grid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
